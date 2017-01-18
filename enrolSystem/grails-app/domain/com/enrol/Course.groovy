package com.enrol

class Course {

String department
String title
String leader
String code
Date startDate
Date endDate
String description
int numberOfStudents
double tuitionFees
String studyMode

    static constraints = {

    department blank:false, nullable:false
    title blank:false, nullable:false
    code blank:false, nullable:false
    startDate blank:false, nullable:false
    endDate blank:false, nullable:false
    description blank:false, nullable:false, maxSize:5000, widget:'textarea'
    numberOfStudents blank:false, nullable:false, min:20, max:60
    tuitionfees blank:false, nullable:false, scale:2
    studyMode blank:false, nullable:false, size:20..20

    }
}
