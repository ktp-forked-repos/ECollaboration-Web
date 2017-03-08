package com.general.dto;

import java.util.List;

/**
 * Created by joanna on 2/13/17.
 */
public class ScoreForStudentDTO {

    /**
     * leader : {"token":"abc123","name":"张三","score":98}
     * members : [{"token":"abc123","name":"张三","score":98},{"token":"abc123","name":"张三","score":98}]
     */

    private LeaderBean leader;
    private List<MemberBean> members;

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
         * token : abc123
         * name : 张三
         * score : 98
         */

        private String token;
        private String name;
        private Double score;

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Double getScore() {
            return score;
        }

        public void setScore(Double score) {
            this.score = score;
        }
    }

    public static class MemberBean {
        /**
         * token : abc123
         * name : 张三
         * score : 98
         */

        private String token;
        private String name;
        private Double score;

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Double getScore() {
            return score;
        }

        public void setScore(Double score) {
            this.score = score;
        }
    }
}
