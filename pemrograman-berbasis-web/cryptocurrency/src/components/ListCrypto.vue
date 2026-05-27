<script setup>
import { computed, ref, watchEffect } from 'vue';
import { IonItem, IonLabel, IonList, IonButton } from '@ionic/vue';
import axios from 'axios';

const props = defineProps({
    refresh: Function
})

const response = ref(null)
const isLoading = ref(true)

const fetchData = async () => {
    return await axios.get("https://api.coinlore.net/api/tickers/")
        .then((res) => {
            console.log(res.data)
            return res.data
        })

}

const handleClickRefresh = () => {
    isLoading.value = true
}

watchEffect(async () => {
    if (isLoading.value) {

        try {
            response.value = await fetchData()
            isLoading.value = false
        } catch (err) {
            console.log(err)
        }
    }

})
</script>

<template>
  <div style="display: flex; align-items: center; justify-content: center; flex-direction: column;">
    <ion-button v-on:click="handleClickRefresh">Refresh</ion-button>

  </div>
    <div v-if="isLoading">
        ...Loading
    </div>
    <div v-if="!isLoading && response && response.data && response.data.length" class="wrappper" style="margin-block: 20px;">


        <ion-list :inset="true" style="max-height: 90svh; overflow: scroll;">
            <ion-item v-for="(item, index) in response.data" v-bind:key="index">
                <div style="display: grid; grid-template-columns: 25% 40% 35%; width: 100%;">

                    <div style="text-align: center;">
                        <span>Rank</span>
                        <ion-label>{{ item.rank }}</ion-label>
                    </div>
                    <div style="text-align: left;">
                        <span>{{ item.symbol }}</span>
                        <ion-label>{{ item.name }}</ion-label>
                    </div>
                    <div style="text-align: left;">
                        <span>USD</span>
                        <ion-label>{{ item.price_usd }}</ion-label>
                    </div>
                </div>
            </ion-item>
        </ion-list>

    </div>

</template>

<style>
div>span {
    font-size: 12px;
}

ion-label {
    font-weight: bold;
}
</style>