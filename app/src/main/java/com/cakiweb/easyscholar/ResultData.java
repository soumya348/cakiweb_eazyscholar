package com.cakiweb.easyscholar;

public class ResultData {
    String resultClass;
    String examName;
    String viewResult;
    public ResultData(String resultClass, String examName, String viewResult) {
        this.resultClass = resultClass;
        this.examName = examName;
        this.viewResult = viewResult;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public String getResultClass() {
        return resultClass;
    }

    public void setResultClass(String resultClass) {
        this.resultClass = resultClass;
    }

    public String getViewResult() {
        return viewResult;
    }

    public void setViewResult(String viewResult) {
        this.viewResult = viewResult;
    }

}
