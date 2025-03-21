import request from '@/utils/request'

// 查询不同学院转专业人数
export function echarts1() {
  return request({
    url: '/system/student/echarts1',
    method: 'get',
  })
}

// 查询学生管理列表
export function listStudent(query) {
  return request({
    url: '/system/student/list',
    method: 'get',
    params: query
  })
}

// 查询学生管理详细
export function getStudent(id) {
  return request({
    url: '/system/student/' + id,
    method: 'get'
  })
}

// 新增学生管理
export function addStudent(data) {
  return request({
    url: '/system/student',
    method: 'post',
    data: data
  })
}

// 修改学生管理
export function updateStudent(data) {
  return request({
    url: '/system/student',
    method: 'put',
    data: data
  })
}

// 删除学生管理
export function delStudent(id) {
  return request({
    url: '/system/student/' + id,
    method: 'delete'
  })
}

// 查询用户昵称
export function getNickName() {
  return request({
    url: '/system/student/nickName',
    method: 'get'
  })
}
