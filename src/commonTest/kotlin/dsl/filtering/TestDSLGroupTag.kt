package dsl.filtering

import com.algolia.search.dsl.filtering.DSLGroupTag
import com.algolia.search.dsl.filtering.FilterTag
import shouldEqual
import unknown
import kotlin.test.Test


internal class TestDSLGroupTag {

    @Test
    fun tag() {
        val dsl = DSLGroupTag {
            +tag(unknown)
        }

        dsl shouldEqual setOf(FilterTag(unknown))
    }
}