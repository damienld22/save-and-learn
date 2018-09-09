<template>
  <div id="best-practices">
    <table class="table">
      <thead>
        <tr>
          <th>Title</th>
          <th>Content</th>
          <th></th>
          <th></th>
        </tr>
      </thead>
      <tbody>
        <tr v-bind:key="index" v-for="(bp, index) in bestPractices">
          <td class="bpTitle">{{ bp.title }}</td>
          <td class="bpContent">{{ bp.content }}</td>
          <td class="editBtn">
            <a class="button is-info is-outlined">
              <span>Edit</span>
              <span class="icon is-small">
                <i class="fas fa-edit"></i>
              </span>
            </a>
          </td>
          <td class="deleteBtn">
            <a class="button is-danger is-outlined" @click="deleteBestPractice(index)">
              <span>Delete</span>
              <span class="icon is-small">
                <i class="fas fa-times"></i>
              </span>
            </a>
          </td>
        </tr>
      </tbody>
    </table>
    <simplert :useRadius="true"
      :useIcon="true"
      ref="simplert">
    </simplert>
  </div>
</template>

<script>
import axios from 'axios'
import { URL_SERVER_BEST_PRACTICES } from '../utils/network'
import Simplert from 'vue2-simplert'

export default {
  name: 'BestPractices',
  components: {
    Simplert
  },
  data: () => {
    return {
      bestPractices: null,
      indexSelectedBestPractice: null
    }
  },
  created: function () {
    this.init()
  },
  methods: {
    init: function () {
      const url = URL_SERVER_BEST_PRACTICES
      axios.get(url).then((result) => {
        this.bestPractices = result.data['_embedded']['best-practice']
      }).catch((err) => {
        // TODO: Handle error
        console.error(err)
      })
    },
    deleteBestPractice: function (index) {
      this.indexSelectedBestPractice = index
      let deleteModal = {
        title: 'Do you want to delete this best practice ?',
        message: `Your best practice is : "${this.bestPractices[index].title}"`,
        type: 'warning',
        useConfirmBtn: true,
        customConfirmBtnText: 'Yes',
        onConfirm: this.onDeleteModalConfirm
      }
      this.$refs.simplert.openSimplert(deleteModal)
    },
    onDeleteModalConfirm: function () {
      const linkOfBestPractice = this.bestPractices[this.indexSelectedBestPractice]['_links']['self']['href']
      axios.delete(linkOfBestPractice).then((res) => {
        this.bestPractices.splice(this.indexSelectedBestPractice, 1)
        this.indexSelectedBestPractice = null
      }).catch((err) => {
        // TODO: Handle error
        console.error(err)
      })
    }
  }
}
</script>

<style scoped>

table, td {
  width: 100%;
}
.bpTitle {
  width: 20%;
}
.bpContent {
  width: 60%;
}
.editBtn, .deleteBtn {
  width: 10%;
}
</style>
