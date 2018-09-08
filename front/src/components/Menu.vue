<template>
  <div id="menu">
    <div class="tabs">
      <ul>
        <li id="best-practices" v-on:click="updateActiveTab('best-practices')"><router-link to="/best-practices">Best practices</router-link></li>
        <li id="libraries" v-on:click="updateActiveTab('libraries')"><router-link to="/libraries">Libraries</router-link></li>
      </ul>
    </div>
    <router-view></router-view>
  </div>
</template>

<script>
export default {
  methods: {
    updateActiveTab (tab) {
      for (let elt of document.getElementsByTagName('li')) {
        elt.classList.remove('is-active')
        document.getElementById(tab).classList.add('is-active')
      }
    }
  },
  mounted: function () {
    const currentTab = window.location.href.split('/').pop()
    document.getElementById(currentTab).classList.add('is-active')
  }
}
</script>
