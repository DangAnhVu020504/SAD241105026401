![Diagram](http://www.plantuml.com/plantuml/png/encoded-diagram-text)
![Class](https://planttext.com/api/plantuml/png/X94zJWCn48NxESLeAq1oGHkb24eA8b4X96fhTvGTnPvPURn4278o2ewKAyJBxeAG-Edyv6_UU_QStjvNbdtAVGm0jcV1f4O0cNCWlAVWCwjOovsXmtNmPhXXlqi-0a0zwWE5mBB35q34hMHyP6dqO8DyKcxmJklzGqiRrNHn2STvyAOhoP4aJ_fM-v8zdjSQOo-p6Wtdl683y9cwV7NbJjoNtQAKQ2bnzbBJ3-3a_H_sKUSNgBgkyChrdSCgUdckfeQBmRjJu-7N_g279tndOKNIb2sS0G00__y30000)
![Component](https://planttext.com/api/plantuml/png/P951JiCm44NtSufHLcpS8w0M2bMaLWegNRLP67j8hIPsv7740kLaB3WILs2Iq2oADxR-6_tvN_xv-bvoqZ5rJGt05-Sn1YQ0v59DM6XpqHKnAdmCJHiy-OHhfwke6u1sefWzno3waxSPVWBACVFmSHDrUtO63qpnv7EVABvhGoLgniqXXnx0rA6pE29FIInwGF31YlFEMIivNXt5g_VneMFdYHcteNAcdCIrJXfNneW-MgzNY2DnrusOxtGw3souRrYMvuaQpWOylg1702kcRve55u5J5Md_iZtvESW-XKWMYnWCbqCHwOFAXW-lxkSwCFUQoDsq_hO5ggvL4vBeIlsb-3yc1XEIiSNYDWGioLlvory0003__mC0)
![Use Case](https://planttext.com/api/plantuml/png/L511IWD14BpNAygREMoypq42kmg2g21vG9Cqmv3PcT0pAuZuCWy-oI_O48oa3arHNLKq_VFrlMbTh2zp1jeX5Lfj2lJKi_95TWU9oe7RfXp5nvGacim0J7TTIdJRlKfVJ1i_GCVrOusfh4vyD5ygRpXfLYTUP2jAupXjyGc4k_cOwxjg8CAOavOU45wNezfRQjK2yEVWCDoUo_yT5_AfWUlrMMBWq_ELupBY6RyWy84oCzOziD6ozpVy0W00__y30000)
*TEST
@startuml
class Student {
    + String name
    + int age
    + String studentID
    + void enrollCourse()
    + void takeExam()
}

class Course {
    + String courseName
    + String courseCode
    + int credits
    + void startCourse()
    + void endCourse()
}

Student "1" -- "*" Course : "enrolls in"
@enduml
