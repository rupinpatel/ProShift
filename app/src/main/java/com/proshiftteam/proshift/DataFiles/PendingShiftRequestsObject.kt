package com.proshiftteam.proshift.DataFiles

class PendingShiftRequestsObject (
    var id: Int = 0,
    var company: Int = 0,
    var company_name: String = "",
    var employee: Int = 0,
    var employee_name: String = "",
    var shift: Int = 0,
    var is_approved: Boolean,
    var is_denied: Boolean
)