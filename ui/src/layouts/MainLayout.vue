<template>
  <v-app>
    <v-app-bar color="primary">
      <v-app-bar-title class="font-weight-bold" style="user-select: none">
        {{ i18n.t('app.title') }}
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
            <v-list-item @click="router.push('/admin')">
              <template #prepend>
                <v-icon icon="mdi-wrench" class="opacity-100" />
              </template>
              <v-list-item-title>{{ i18n.t('userMenu.administration') }}</v-list-item-title>
            </v-list-item>
            <v-list-item @click="logout">
              <template #prepend>
                <v-icon icon="mdi-logout" class="opacity-100" />
              </template>
              <v-list-item-title>{{ i18n.t('userMenu.logout') }}</v-list-item-title>
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

    <footer class="d-flex justify-space-between pa-3">
      <span class="font-weight-bold text-white blink bg-red px-1" style="border-radius: 7px">
        {{ i18n.t('app.demoWarning') }}
      </span>
      <span>
        numgen | Copyright © 2025 Vincent Westenberg |
        <a href="https://github.com/ikkowy/numgen/blob/development/LICENSE">MIT License</a>
      </span>
    </footer>
  </v-app>
</template>

<script setup lang="ts">
import { useRouter } from 'vue-router';
import { useI18n } from 'vue-i18n';

const router = useRouter();

const i18n = useI18n();

function logout(): void {
  router.push('/login');
}
</script>

<style scoped>
.blink {
  animation: blinker 3s linear infinite;
}

@keyframes blinker {
  50% {
    opacity: 0;
  }
}
</style>
