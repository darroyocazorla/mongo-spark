/*
 * Copyright 2016 MongoDB, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.mongodb.spark.sql.fields

import org.bson.BsonDocument

/**
 * The JavaScriptWithScope companion object
 *
 * @since 1.0
 */
object JavaScriptWithScope {
  /**
   * Create a new instance
   *
   * @param code  the javascript code
   * @param scope a document representing the scope
   * @return a new instance
   */
  def apply(code: String, scope: BsonDocument): JavaScriptWithScope = new JavaScriptWithScope(code, scope.toJson())
}

/**
 * A case class representing the Bson JavaScriptWithScope type
 *
 * @since 1.0
 */
case class JavaScriptWithScope(code: String, scope: String)