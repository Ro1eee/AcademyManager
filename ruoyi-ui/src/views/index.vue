<template>
  <div class="welcome-container">
    <div class="welcome-card">
      <h1 class="welcome-message">欢迎回来，{{ studentName }}！</h1>
      <p class="user-info">
        书院：{{ department }}<br />
        系统内专业：{{ major }}<br />
        招生录取专业：{{ specialty }}<br />
        分流形式：{{ splitFlow }}<br />
      </p>
      <p class="greeting-message">祝你今天有个愉快的一天！😊</p>
    </div>
  </div>
</template>

<script>
import axios from "axios";
import store from "@/store";

export default {
  name: "WelcomePage",
  data() {
    return {
      studentName: '',
      department: '',
      major: '',
      specialty: '',
      splitFlow: ''
    };
  },
  computed: {
    userName() {
      return this.$store.state.user.name; // 获取用户名
    }
  },
  mounted() {
    this.initializeUserData();
  },
  methods: {
    initializeUserData() {
      axios
        .get(`http://localhost:3000/api/users/${this.userName}`)
        .then(response => {
          const userData = response.data;
          this.studentName = userData.姓名;
          this.department = userData.管理部门;
          this.major = userData.系统内专业;
          this.specialty = userData.招生录取专业;
          this.splitFlow = userData.分流形式;
        })
        .catch(error => {
          console.error("获取用户信息失败", error);
          this.$message.error("获取用户信息失败");
        });
    }
  }
};
</script>

<style scoped>
.welcome-container {
  display: flex;
  justify-content: center;
  align-items: center;
  min-height: 100vh;
  background-color: #f0f4f8;
  padding: 20px;
}

.welcome-card {
  background-color: #ffffff;
  padding: 50px;  /* 增加内边距让欢迎框更大 */
  border-radius: 15px;  /* 使圆角更大 */
  box-shadow: 0 6px 20px rgba(0, 0, 0, 0.1); /* 增加阴影使其更立体 */
  max-width: 800px;  /* 设置最大宽度 */
  width: 100%;
  text-align: center;
}

.welcome-message {
  font-size: 30px;  /* 增加欢迎信息的字体大小 */
  font-weight: bold;
  color: #333;
  margin-bottom: 30px;  /* 增加下边距 */
}

.user-info {
  font-size: 18px;  /* 增加字体大小 */
  color: #555;
  margin-bottom: 30px;
  text-align: left;
}

.greeting-message {
  font-size: 20px;  /* 增加问候信息的字体大小 */
  color: #28a745;
  font-weight: bold;
}

@media (max-width: 768px) {
  .welcome-card {
    padding: 30px;  /* 减少移动端的内边距 */
  }

  .welcome-message {
    font-size: 24px;  /* 在小屏幕上减小欢迎信息字体大小 */
  }

  .user-info {
    font-size: 16px;  /* 调整移动端字体大小 */
  }

  .greeting-message {
    font-size: 18px;  /* 调整移动端字体大小 */
  }
}
</style>
