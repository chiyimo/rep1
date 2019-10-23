package com.turing.entity;

import java.io.Serializable;

public class Salgrade implements Serializable {
    private Long grade;

    private Long losal;

    private Long hisal;

    private static final long serialVersionUID = 1L;

    public Long getGrade() {
        return grade;
    }

    public void setGrade(Long grade) {
        this.grade = grade;
    }

    public Long getLosal() {
        return losal;
    }

    public void setLosal(Long losal) {
        this.losal = losal;
    }

    public Long getHisal() {
        return hisal;
    }

    public void setHisal(Long hisal) {
        this.hisal = hisal;
    }
}