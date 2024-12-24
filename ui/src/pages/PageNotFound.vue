<template>
  <v-app>
    <v-main>
      <v-container>
        <v-card class="mt-10 pa-5" variant="elevated">
          <v-card-text class="text-center">
            <h1>
              <v-icon icon="mdi-magnify" />
              Page not found.
            </h1>
            <div class="mt-3">
              The requested page is not available.
            </div>
          </v-card-text>

          <v-card-actions>
            <v-btn
              color="primary"
              size="large"
              variant="flat"
              @click="router.push('/')"
            >
              Home
            </v-btn>
            <v-btn
              size="large"
              variant="outlined"
              @click="router.back()"
            >
              Back
            </v-btn>
          </v-card-actions>
        </v-card>
      </v-container>
    </v-main>
  </v-app>
</template>

<script setup lang="ts">
import { useRouter } from 'vue-router';
import { ro } from 'vuetify/locale';

const router = useRouter();
</script>
