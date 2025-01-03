import { createApp } from 'vue';

import App from './App.vue'

import { createVuetify, type ThemeDefinition } from 'vuetify';

import 'vuetify/styles';

import '@mdi/font/css/materialdesignicons.css';

const app = createApp(App);

import { createRouter, createWebHistory } from 'vue-router';
import routes from '@/router/routes';

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes
});

const customTheme: ThemeDefinition = {
  dark: false,
  colors: {
    primary: '#7e003f',
    secondary: '#d50072'
  }
};

const vuetify = createVuetify({
  theme: {
    defaultTheme: 'customTheme',
    themes: { customTheme }
  }
});

app.use(router);

app.use(vuetify);

app.mount('#app');
