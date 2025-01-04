<template>
  <v-card class="d-flex flex-column pa-3">
    <v-card-text>
      <div class="d-flex ga-3">
        <v-select :label="i18n.t('numberGenerator.project')" variant="outlined" />
        <v-select :label="i18n.t('numberGenerator.classifier')" variant="outlined" />
      </div>
      <v-card class="pa-3 text-h3 text-mono text-center" variant="outlined">
        XXXX-XX-XXXX
      </v-card>
    </v-card-text>
    <v-card-actions>
      <v-btn
        class="text-none"
        color="primary"
        prepend-icon="mdi-counter"
        size="large"
        variant="flat"
      >
        {{ i18n.t('numberGenerator.generate') }}
      </v-btn>
      <v-btn
        class="text-none"
        color="secondary"
        prepend-icon="mdi-content-copy"
        size="large"
        variant="flat"
        @click="showCopyMessage = true"
      >
        {{ i18n.t('numberGenerator.copy') }}
      </v-btn>
      <v-snackbar
        color="secondary"
        min-width="0"
        style="user-select: none"
        timeout="2000"
        v-model="showCopyMessage"
      >
        {{ i18n.t('numberGenerator.copiedGeneratedNumber') }}
      </v-snackbar>
    </v-card-actions>
  </v-card>
</template>

<script setup lang="ts">
import { ref } from 'vue';
import { useI18n } from 'vue-i18n';

const i18n = useI18n();

const showCopyMessage = ref<boolean>(false);
</script>
