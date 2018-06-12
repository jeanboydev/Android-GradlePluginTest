package com.jeanboy.plugin.timer

import org.gradle.api.Plugin
import org.gradle.api.Project


class PluginImpl implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.gradle.addListener(new TimeListener())
    }
}