<script setup>
import { computed, ref } from 'vue';

const response = ref(null)
const currentDate = new Date()

const currentHour = computed(() => response.value.hourly.time.findIndex((d, index) => {
    const time = new Date(d)
    return time.getHours() >= currentDate.getHours() && time.getHours() <= currentDate.getHours()
    && time.getMonth() >= currentDate.getMonth() && time.getMonth() <= currentDate.getHours()
    && time.getDate() >= currentDate.getDate() && time.getMonth() <= currentDate.getMonth()
    ? index : -1
}))
try {
    response.value = await fetch("https://api.open-meteo.com/v1/forecast?latitude=-6.2&longitude=106.8&hourly=temperature_2m").then(async (res) => {
        return await res.json()
    })
    console.log(response.value)

} catch (err) {
    console.log(err)
}



</script>

<template>

    <div style="display: flex; justify-content: center; max-height: 500px; overflow-y: scroll;">
        <table style="border: 2px white solid; border-collapse: collapse;">
            <thead>
                <tr>
                    <th>Tanggal</th>
                    <th>Temperature</th>
                </tr>
            </thead>
            <tbody v-for="index in response.hourly.time.length">
                <tr>
                    <td>{{ new Date(response.hourly.time[index]).toLocaleString() }}</td>
                    <td>{{ response.hourly.temperature_2m[index] }}&deg;C</td>
                </tr>
            </tbody>
        </table>
    </div>

</template>

<style>
th,
td {
    padding: 15px;
    border: 2px white solid;
}
</style>