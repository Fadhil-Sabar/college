<template>
  <Suspense>
    <ListCrypto />

    <template #fallback>
      Loading...
    </template>
  </Suspense>
</template>

<script setup lang="ts">
import { IonButton } from '@ionic/vue';
import { defineAsyncComponent, Suspense } from 'vue';

const ListCrypto = defineAsyncComponent(() =>
  import('../components/ListCrypto.vue')
)


</script>

<style>
.ion-button {}
</style>