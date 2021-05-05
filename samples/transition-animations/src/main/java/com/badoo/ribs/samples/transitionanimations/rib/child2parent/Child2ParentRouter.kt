package com.badoo.ribs.samples.transitionanimations.rib.child2parent

import android.os.Parcelable
import com.badoo.ribs.core.modality.BuildParams
import com.badoo.ribs.routing.Routing
import com.badoo.ribs.routing.resolution.ChildResolution.Companion.child
import com.badoo.ribs.routing.resolution.Resolution
import com.badoo.ribs.routing.router.Router
import com.badoo.ribs.routing.source.RoutingSource
import com.badoo.ribs.samples.transitionanimations.rib.child2.Child2Builder
import kotlinx.android.parcel.Parcelize

class Child2ParentRouter(
        buildParams: BuildParams<Nothing?>,
        private val childBuilder: Child2Builder
) : Router<Child2ParentRouter.Configuration>(
        buildParams = buildParams,
        routingSource = RoutingSource.permanent(Configuration.Child)
) {
    sealed class Configuration : Parcelable {
        @Parcelize
        object Child : Configuration()
    }

    override fun resolve(routing: Routing<Configuration>): Resolution =
            when (routing.configuration) {
                Configuration.Child -> child { childBuilder.build(it) }
            }
}
