<template>
  <v-app>
    <v-main>
      <v-container>
        <v-card>
          <v-card-text>
            <v-col>
              <v-text-field
                label="Username"
                variant="outlined"
              />
              <v-text-field
                label="Password"
                type="password"
                variant="outlined"
              />
              <v-btn
                color="primary"
                size="large"
                variant="flat"
                @click="login"
              >
                Login
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

const router = useRouter();

function login(): void {
  router.push('/');
}
</script>
