package documentation.methods.analytics

import clientAnalytics
import com.algolia.search.model.analytics.ABTestID
import kotlin.test.Ignore
import kotlin.test.Test
import runBlocking

@Ignore
internal class DocDeleteABTest {

//    suspend fun ClientAnalytics.deleteABTest(
//        #{abTestID}: __ABTestID__,
//        requestOptions: __RequestOptions?__ = null
//    ): DeletionABTest

    @Test
    fun snippet1() {
        runBlocking {
            clientAnalytics.deleteABTest(ABTestID(42))
        }
    }
}
