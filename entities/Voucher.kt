package entities

import java.util.*

/**
 * Created by denak on 22.05.2017.
 */
data class Voucher(val id : Int, var client: Client, var hotel: Hotel, var date: Date) {
}