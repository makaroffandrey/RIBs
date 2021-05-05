package com.badoo.ribs.samples.transitionanimations.rib.child2parent

import com.badoo.ribs.builder.SimpleBuilder
import com.badoo.ribs.core.modality.BuildParams
import com.badoo.ribs.samples.transitionanimations.rib.child2.Child2Builder

class Child2ParentBuilder(private val childBuilder: Child2Builder) : SimpleBuilder<Child2Parent>() {
    private fun router(buildParams: BuildParams<Nothing?>) =
            Child2ParentRouter(buildParams, childBuilder)

    override fun build(buildParams: BuildParams<Nothing?>): Child2Parent =
            Child2ParentNode(buildParams, listOf(router(buildParams)))
}
