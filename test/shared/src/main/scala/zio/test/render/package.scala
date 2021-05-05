/*
 * Copyright 2019-2021 John A. De Goes and the ZIO Contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package zio.test

import zio.test.render.LogLine.Fragment.Style
import zio.test.render.LogLine.Line

package object render {

  def info(s: String): LogLine.Fragment    = LogLine.Fragment(s, Style.Info)
  def error(s: String): LogLine.Fragment   = LogLine.Fragment(s, Style.Error)
  def warn(s: String): LogLine.Fragment    = LogLine.Fragment(s, Style.Warning)
  def primary(s: String): LogLine.Fragment = LogLine.Fragment(s, Style.Primary)
  def detail(s: String): LogLine.Fragment  = LogLine.Fragment(s, Style.Detail)
  def fr(s: String): LogLine.Fragment      = LogLine.Fragment(s, Style.Default)
  val sp: LogLine.Fragment                 = LogLine.Fragment(" ")

  def withOffset(i: Int)(line: LogLine.Line): Line = line.withOffset(i)
}
