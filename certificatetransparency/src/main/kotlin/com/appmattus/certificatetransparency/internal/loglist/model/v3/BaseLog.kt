/*
 * Copyright 2025 Appmattus Limited
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.appmattus.certificatetransparency.internal.loglist.model.v3

internal interface BaseLog {
    val description: String?
    val key: String
    val logId: String
    val maximumMergeDelay: Int
    val listOfPreviousOperators: List<PreviousOperator>?
    val dns: Hostname?
    val temporalInterval: TemporalInterval?
    val logType: LogType?
    val state: State?
}
