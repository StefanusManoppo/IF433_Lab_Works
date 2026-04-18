package oop_00000121955_StefanusEdwardAzaryaManoppo.week08

// name adalah Non-Null (wajib), email dan phone adalah Nullable
class UserProfile(
    val name: String,
    val email: String?,
    val phone: String? = null // Default argument null
)