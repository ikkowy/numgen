<template>
  <v-app>
    <v-app-bar color="primary">
      <v-app-bar-title style="user-select: none">
        Number Generator
      </v-app-bar-title>
      <template #append>
        <v-menu>
          <template #activator="{ props }">
            <v-btn
              icon="mdi-account-circle"
              v-bind="props"
            />
          </template>
          <v-list density="compact">
            <v-list-item @click="console.log('settings')">
              <template #prepend>
                <v-icon icon="mdi-wrench" class="opacity-100" />
              </template>
              <v-list-item-title>Administration</v-list-item-title>
            </v-list-item>
            <v-list-item @click="console.log('logout')">
              <template #prepend>
                <v-icon icon="mdi-logout" class="opacity-100" />
              </template>
              <v-list-item-title>Logout</v-list-item-title>
            </v-list-item>
          </v-list>
        </v-menu>
      </template>
    </v-app-bar>

    <v-main>
      <v-container>
        <router-view />
      </v-container>
    </v-main>
  </v-app>
</template>

<script setup lang="ts">
</script>
