import Vue from 'vue'
import Router from 'vue-router'
import BestPractices from './components/BestPractices'
import Libraries from './components/Libraries'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      redirect: { name: 'best-practices' }
    },
    {
      path: '/best-practices',
      name: 'bestPractices',
      component: BestPractices
    },
    {
      path: '/libraries',
      name: 'libraries',
      component: Libraries
    }
  ]
})
