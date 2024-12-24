export default [
  {
    path: '/login',
    component: () => import('@/pages/LoginPage.vue')
  },
  {
    path: '/',
    component: () => import('@/layouts/MainLayout.vue'),
    children: [
      {
        path: '',
        component: () => import('@/pages/HomePage.vue'),
      },
    ],
  },
  {
    path: '/:pathMatch(.*)*',
    component: () => import('@/pages/PageNotFound.vue')
  }
];
