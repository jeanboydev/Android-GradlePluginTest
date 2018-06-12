package com.jeanboy.plugin.test

import org.gradle.api.Plugin
import org.gradle.api.Project


class TestPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.task('testTask') << {
            println("========================")
            println("hello gradle plugin!")
            println("========================")
        }
    }
}