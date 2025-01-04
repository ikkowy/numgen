<template>
  <v-app>
    <v-main>
      <v-container>
        <v-card>
          <v-card-text>
            <v-col>
              <v-text-field
                :label="i18n.t('loginPage.username')"
                variant="outlined"
              />
              <v-text-field
                :label="i18n.t('loginPage.password')"
                type="password"
                variant="outlined"
              />
              <v-btn
                class="text-none"
                color="primary"
                size="large"
                variant="flat"
                @click="login"
              >
                {{ i18n.t('loginPage.login') }}
              </v-btn>
            </v-col>
          </v-card-text>
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

function login(): void {
  router.push('/');
}
</script>
