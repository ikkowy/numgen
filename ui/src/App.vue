<template>
  <v-app>
    <v-main class="pa-3">
      <v-app-bar color="primary">
        <template #append>
          <v-menu>
            <template #activator="{ props }">
              <v-btn
                icon="mdi-account-circle"
                v-bind="props"
              />
            </template>
            <v-list density="compact">
              <v-list-item
                prepend-icon="mdi-wrench"
                title="Administration"
                @click="console.log('settings')"
              />
              <v-list-item
                prepend-icon="mdi-logout"
                title="Logout"
                @click="console.log('logout')"
              />
            </v-list>
          </v-menu>
        </template>
      </v-app-bar>
      <v-main>
        <number-generator />
      </v-main>
    </v-main>
  </v-app>
</template>

<script setup lang="ts">
import NumberGenerator from '@/components/NumberGenerator.vue';
</script>
