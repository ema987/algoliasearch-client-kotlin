package model

import com.algolia.search.helper.DateISO8601
import com.algolia.search.model.ClientDate
import kotlin.test.Test
import shouldEqual

internal class TestClientDate {

    private val timestamp = 10000L
    private val format = DateISO8601.format(timestamp)
    private val formatMillis = DateISO8601.format(timestamp, true)

    @Test
    fun raw() {
        ClientDate(format).raw shouldEqual format
        ClientDate(formatMillis).raw shouldEqual formatMillis
        ClientDate(timestamp).raw shouldEqual format
    }
}
