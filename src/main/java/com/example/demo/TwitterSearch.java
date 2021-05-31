package com.example.demo;

import lombok.ToString;

import java.util.List;

@ToString
public class TwitterSearch {
    List<Status> statuses;

    public TwitterSearch(List<Status> statuses) {
        this.statuses = statuses;
    }

    public TwitterSearch() {
    }

    public List<Status> getStatuses() {
        return statuses;
    }

    public void setStatuses(List<Status> statuses) {
        this.statuses = statuses;
    }

    @ToString
    static class Status {
        String text;
        String created_at;

        public Status() {
        }

        public Status(String text, String created_at) {
            this.text = text;
            this.created_at = created_at;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }
    }
}
