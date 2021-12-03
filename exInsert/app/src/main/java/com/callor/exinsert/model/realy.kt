package com.now.three_days.model

import lombok.*

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
data class realy(

    var r_seq:Int,
    var r_title:String,
    var r_sDate:String,
    var r_eDate:String,
    var r_image:String,
    var r_userid:String,
    var r_content:String,

    )
