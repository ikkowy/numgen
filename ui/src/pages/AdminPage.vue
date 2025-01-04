<template>
  <div>
    <v-tabs v-model="tab">
      <v-tab class="text-none" prepend-icon="mdi-briefcase" value="projects">Projects</v-tab>
      <v-tab class="text-none" prepend-icon="mdi-tag" value="classifiers">Classifiers</v-tab>
      <v-tab class="text-none" prepend-icon="mdi-account" value="users">Users</v-tab>
    </v-tabs>

    <v-tabs-window class="fill-height" v-model="tab">
      <v-tabs-window-item class="pa-3" value="projects">
        <v-btn variant="text" class="text-none" prepend-icon="mdi-briefcase-plus">Create Project</v-btn>
        <v-data-table />
      </v-tabs-window-item>

      <v-tabs-window-item class="pa-3" value="classifiers">
        <v-btn variant="text" class="text-none" prepend-icon="mdi-tag-plus">Create Classifier</v-btn>
        <v-data-table />
      </v-tabs-window-item>

      <v-tabs-window-item class="pa-3" value="users">
        <v-btn variant="text" class="text-none" prepend-icon="mdi-account-plus">Create User</v-btn>
        <v-data-table />
      </v-tabs-window-item>
    </v-tabs-window>
  </div>
</template>

<script setup lang="ts">
import { ref } from 'vue';

const tab = ref();
</script>
