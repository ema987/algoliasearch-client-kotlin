package documentation.methods.multicluster

import com.algolia.search.model.multicluster.ClusterName
import com.algolia.search.model.multicluster.UserID
import documentation.client
import kotlin.test.Ignore
import kotlin.test.Test
import runBlocking

@Ignore
internal class DocAssignUserID {

//    suspend fun ClientSearch.assignUserID(
//        #{userID}: __UserID__,
//        #{clusterName}: __ClusterName__,
//        #{requestOptions}: __RequestOptions?__ = null
//    ): Creation

    @Test
    fun snippet1() {
        runBlocking {
            client.assignUserID(UserID("myUserID1"), ClusterName("c1-test"))
        }
    }
}
