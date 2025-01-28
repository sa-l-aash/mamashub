package com.kabarak.kabarakmhis.pnc.data_class

data class Detail(
    val detailQuestion: String?,
    val detailAnswer: String?
)
data class Child(
    val id: String,
    val name: String?,
    val birthDate: String?,

)
data class Patient(
    val id: String,
    val firstName: String,
    val lastName: String,
    val dateOfBirth: String
)




data class ChildDetail(
    val question: String,
    val answer: String
)

data class CongenitalAbnormality(
    val id: String,
    val description: String,
    val remarks: String?
)
data class BcgVaccination(
    val id: String,
    val status: String,
    val dateGiven: String?,
    val dateOfNextVisit: String?,
    val batchNumber: String?,
    val lotNumber: String?,
    val manufacturer: String?,
    val dateOfExpiry: String?
)

data class PolioVaccination(
    val id: String,
    val status: String,
    val dose: String?,
    val dateGiven: String?,
    val dateOfNextVisit: String?,
    val batchNumber: Int?,
    val lotNumber: Int?,
    val manufacturer: String?,
    val dateOfExpiry: String?
)

data class MeaslesImmunization(
    val id: String,
    val visit: String,
    val dose: String?,
    val batchNumber: String?,
    val lotNumber: String?,
    val manufacturer: String?,
    val dateOfExpiry: String?
)
data class ChildItem(
    val id: String,
    val name: String,
    val gender: String,
    val dob: String
)

data class CivilRegistration(
    val id: String,
    val name: String,
    val sexOfChild: String,
    val birthDate: String,
)
data class IPV(
    val id: String,
    val dateGiven: String,
    val nextVisit: String,
)

data class Diphtheria(
    val id: String,
    val dose: String,
    val date: String,
    val nextDate: String,
    val batch: String?,
    val lotnumber: String?,
    val manufacturer: String?,
    val expiryDate: String?
)
data class QuestionnaireDetails(
    val detailQuestion: String,
    val detailAnswer: String,
)

