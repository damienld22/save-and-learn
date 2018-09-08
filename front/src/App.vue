<template>
  <div id="app">
    <Title />
    <Menu />
  </div>
</template>

<script>
import Title from './components/Title'
import Menu from './components/Menu'

export default {
  name: 'App',
  components: {
    Title,
    Menu
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
