package documentation.parameters.personalization

import com.algolia.search.dsl.query
import documentation.index
import kotlin.test.Ignore
import kotlin.test.Test
import runBlocking

@Ignore
internal class DocEnablePersonalization {

//    enablePersonalization: Boolean = true|false

    @Test
    fun snippet1() {
        runBlocking {
            val query = query("query") {
                enablePersonalization = true
            }

            index.search(query)
        }
    }
}
