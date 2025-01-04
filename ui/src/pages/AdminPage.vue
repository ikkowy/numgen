<template>
  <div>
    <v-tabs v-model="tab">
      <v-tab class="text-none" prepend-icon="mdi-briefcase" value="projects">{{ i18n.t('admin.tab.projects') }}</v-tab>
      <v-tab class="text-none" prepend-icon="mdi-tag" value="classifiers">{{ i18n.t('admin.tab.classifiers') }}</v-tab>
      <v-tab class="text-none" prepend-icon="mdi-account" value="users">{{ i18n.t('admin.tab.users') }}</v-tab>
    </v-tabs>

    <v-tabs-window class="fill-height" v-model="tab">
      <v-tabs-window-item class="pa-3" value="projects">
        <v-btn variant="text" class="text-none" prepend-icon="mdi-briefcase-plus">{{ i18n.t('admin.tab.projects.createProject') }}</v-btn>
        <v-data-table />
      </v-tabs-window-item>

      <v-tabs-window-item class="pa-3" value="classifiers">
        <v-btn variant="text" class="text-none" prepend-icon="mdi-tag-plus">{{ i18n.t('admin.tab.projects.createClassifier') }}</v-btn>
        <v-data-table />
      </v-tabs-window-item>

      <v-tabs-window-item class="pa-3" value="users">
        <v-btn variant="text" class="text-none" prepend-icon="mdi-account-plus">{{ i18n.t('admin.tab.projects.createUser') }}</v-btn>
        <v-data-table />
      </v-tabs-window-item>
    </v-tabs-window>
  </div>
</template>

<script setup lang="ts">
import { ref } from 'vue';
import { useI18n } from 'vue-i18n';

const i18n = useI18n();

const tab = ref();
</script>
