<template>
  <v-app>
    <v-app-bar color="primary">
      <v-app-bar-title class="font-weight-bold">
        <span style="cursor:pointer; user-select: none" @click="router.push('/')">
          <v-icon icon="mdi-counter" /> &nbsp;
          {{ i18n.t('app.title') }}
        </span>
      </v-app-bar-title>
      <template #append>
        <div class="d-flex justify-center align-center ga-3">
          <v-select
            density="comfortable"
            hide-details
            :items="[{ label: '🇩🇪 DE', value: 'de' }, { label: '🇬🇧 EN', value: 'en' }]"
            item-title="label"
            item-value="value"
            variant="outlined"
            v-model="lang"
          />
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
        </div>
      </template>
    </v-app-bar>

    <v-main>
      <v-container>
        <router-view />
      </v-container>
    </v-main>

    <footer class="d-flex justify-space-between pa-3">
      <span class="font-weight-bold text-white blink bg-red px-1 no-break" style="border-radius: 7px">
        {{ i18n.t('app.demoWarning') }}
      </span>
      <span class="no-break">
        numgen | Copyright © 2025 Vincent Westenberg |
        <v-tooltip location="top">
          <template v-slot:activator="{ props }">
            <a class="text-primary text-decoration-none" v-bind="props" href="https://github.com/ikkowy/numgen/blob/development/LICENSE">MIT License</a>
          </template>
          <template v-slot:default>
            <img src="@/assets/opensourceparrot.gif" style="width: 3em" alt="https://cultofthepartyparrot.com/">
          </template>
        </v-tooltip>
      </span>
    </footer>
  </v-app>
</template>

<script setup lang="ts">
import { useRouter } from 'vue-router';
import { useI18n } from 'vue-i18n';
import { ref, watch } from 'vue';

const router = useRouter();

const i18n = useI18n();

const lang = ref('de');

watch(lang, () => {
  i18n.locale.value = lang.value;
});

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

.no-break {
  overflow: hidden;
  text-overflow: ellipsis;
  white-space: nowrap;
}
</style>
