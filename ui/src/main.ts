import { createApp } from 'vue';

import App from './App.vue'

import { createVuetify, type ThemeDefinition } from 'vuetify';

import 'vuetify/styles';

import '@mdi/font/css/materialdesignicons.css';

import { createRouter, createWebHistory } from 'vue-router';
import routes from '@/router/routes';
import { createI18n } from 'vue-i18n';

import de from '@/i18n/de.json';
import en from '@/i18n/en.json';

const app = createApp(App);

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes
});

const i18n = createI18n({
  locale: 'de',
  messages: { de, en }
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

app.use(i18n);

app.use(vuetify);

app.mount('#app');
