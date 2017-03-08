package com.general.dto;

import java.util.List;

/**
 * Created by joanna on 2/13/17.
 */
public class ProjectMemberDTO {

    /**
     * tutor : 彭杰
     * leader : {"name":"谭霞","student_id":"SA16225099"}
     * members : [{"name":"曾敏","token":"eec53e68-bCAe-b1dC-1c1d-f35F6F2DBd9b","pass_at":"2011-03-10 11:56:31","student_id":"SA16225379"},{"name":"许伟","token":"9cd1F419-ABD6-5af9-7DD2-551D9edE3b9d","pass_at":"1976-02-06 16:08:13","student_id":"SA16225379"},{"name":"姚杰","token":"c791B2eA-60fE-a5f4-85Cc-eDc54CbaE3B4","pass_at":"1998-11-10 21:37:57","student_id":"SA16225379"}]
     */

    private String tutor;
    private LeaderBean leader;
    private List<MemberBean> members;

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public LeaderBean getLeader() {
        return leader;
    }

    public void setLeader(LeaderBean leader) {
        this.leader = leader;
    }

    public List<MemberBean> getMembers() {
        return members;
    }

    public void setMembers(List<MemberBean> members) {
        this.members = members;
    }

    public static class LeaderBean {
        /**
         * name : 谭霞
         * student_id : SA16225099
         */

        private String name;
        //@com.google.gson.annotations.SerializedName("student_id")
        private String studentId;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getStudentId() {
            return studentId;
        }

        public void setStudentId(String studentId) {
            this.studentId = studentId;
        }
    }

    public static class MemberBean {
        /**
         * name : 曾敏
         * token : eec53e68-bCAe-b1dC-1c1d-f35F6F2DBd9b
         * pass_at : 2011-03-10 11:56:31
         * student_id : SA16225379
         */

        private String name;
        private String token;
        //@com.google.gson.annotations.SerializedName("pass_at")
        private String passAt;
        //@com.google.gson.annotations.SerializedName("student_id")
        private String studentId;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public String getPassAt() {
            return passAt;
        }

        public void setPassAt(String passAt) {
            this.passAt = passAt;
        }

        public String getStudentId() {
            return studentId;
        }

        public void setStudentId(String studentId) {
            this.studentId = studentId;
        }
    }
}
