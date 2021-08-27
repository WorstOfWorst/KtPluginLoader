/*
 *  _  __     _   _ _       ____  _             _       _                    _
 *  | |/ /___ | |_| (_)_ __ |  _ \| |_   _  __ _(_)_ __ | |    ___   __ _  __| | ___ _ __
 *  | ' // _ \| __| | | '_ \| |_) | | | | |/ _` | | '_ \| |   / _ \ / _` |/ _` |/ _ \ '__|
 *  | . \ (_) | |_| | | | | |  __/| | |_| | (_| | | | | | |__| (_) | (_| | (_| |  __/ |
 *  |_|\_\___/ \__|_|_|_| |_|_|   |_|\__,_|\__, |_|_| |_|_____\___/ \__,_|\__,_|\___|_|
 *                                        |___/
 *
 * MIT License
 *
 * Copyright (c) 2021 WorstOfWorst
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.github.wow.kotlinloader.loader

import org.bukkit.event.Event
import org.bukkit.event.Listener
import org.bukkit.plugin.Plugin
import org.bukkit.plugin.PluginDescriptionFile
import org.bukkit.plugin.PluginLoader
import org.bukkit.plugin.RegisteredListener
import java.io.File
import java.util.regex.Pattern

class KotlinPluginLoader : PluginLoader {

    override fun loadPlugin(file: File): Plugin {
        TODO("Not yet implemented")
    }

    override fun getPluginDescription(file: File): PluginDescriptionFile {
        TODO("Not yet implemented")
    }

    override fun getPluginFileFilters(): Array<Pattern> {
        TODO("Not yet implemented")
    }

    override fun createRegisteredListeners(
        listener: Listener,
        plugin: Plugin
    ): MutableMap<Class<out Event>, MutableSet<RegisteredListener>> {
        TODO("Not yet implemented")
    }

    override fun enablePlugin(plugin: Plugin) {
        TODO("Not yet implemented")
    }

    override fun disablePlugin(plugin: Plugin) {
        TODO("Not yet implemented")
    }

}
