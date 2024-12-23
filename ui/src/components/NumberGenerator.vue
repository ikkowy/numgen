<template>
  <v-card class="d-flex flex-column pa-3">
    <v-card-text>
      <div class="d-flex ga-3">
        <v-select label="Project" variant="outlined" />
        <v-select label="Category" variant="outlined" />
      </div>
      <v-card class="pa-3 text-h3 text-mono text-center" variant="outlined">
        XXX-XXXXX-XXXXX-XXXXX-XXXXX
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
        Generate
      </v-btn>
      <v-btn
        class="text-none"
        color="secondary"
        prepend-icon="mdi-content-copy"
        size="large"
        variant="flat"
      >
        Copy
      </v-btn>
    </v-card-actions>
  </v-card>
</template>

<script setup lang="ts">
</script>
