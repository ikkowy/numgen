<template>
  <v-app>
    <v-main>
      <v-container>
        <v-card class="mt-10 pa-5" variant="elevated">
          <v-card-text class="text-center">
            <h1>
              <v-icon icon="mdi-magnify" />
              {{ i18n.t('pageNotFound.pageNotFound') }}
            </h1>
            <div class="mt-3">
              {{ i18n.t('pageNotFound.requestedPageNotAvailable') }}
            </div>
          </v-card-text>

          <v-card-actions>
            <v-btn
              class="text-none"
              color="primary"
              prepend-icon="mdi-home"
              size="large"
              variant="flat"
              @click="router.push('/')"
            >
              {{ i18n.t('pageNotFound.home') }}
            </v-btn>
            <v-btn
              class="text-none"
              prepend-icon="mdi-arrow-left"
              size="large"
              variant="outlined"
              @click="router.back()"
            >
              {{ i18n.t('pageNotFound.back') }}
            </v-btn>
          </v-card-actions>
        </v-card>
      </v-container>
    </v-main>
  </v-app>
</template>

<script setup lang="ts">
import { useRouter } from 'vue-router';
import { useI18n } from 'vue-i18n';

const router = useRouter();

const i18n = useI18n();
</script>
