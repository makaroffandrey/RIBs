package com.badoo.ribs.samples.transitionanimations.rib.child2parent

import com.badoo.ribs.core.Node
import com.badoo.ribs.core.modality.BuildParams
import com.badoo.ribs.core.plugin.Plugin

class Child2ParentNode(
        buildParams: BuildParams<*>,
        plugins: List<Plugin> = emptyList()
) : Node<Child2ParentView>(
        buildParams = buildParams,
        viewFactory = null,
        plugins = plugins
), Child2Parent
