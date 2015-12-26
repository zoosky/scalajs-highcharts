/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator v1.0.8 by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>global</code>
  */
@js.annotation.ScalaJSDefined
class Global extends js.Object {

  /**
    * A custom <code>Date</code> class for advanced date handling. For example, <a href="https://github.com/tahajahangir/jdate">JDate</a> can be hooked in to handle Jalali dates.
    * @since 4.0.4
    */
  val Date: js.UndefOr[js.Object] = js.undefined

  /**
    * Path to the pattern image required by VML browsers in order to draw radial gradients.
    * @since 2.3.0
    */
  val VMLRadialGradientURL: js.UndefOr[String] = js.undefined

  /**
    * The URL to the additional file to lazy load for Android 2.x devices. These devices don't 
    *  support SVG, so we download a helper file that contains <a href="http://code.google.com/p/canvg/">canvg</a>,
    *  its dependency rbcolor, and our own CanVG Renderer class. To avoid hotlinking to our site,
    *  you can install canvas-tools.js on your own server and change this option accordingly.
    */
  val canvasToolsURL: js.UndefOr[String] = js.undefined

  /**
    * A callback to return the time zone offset for a given datetime. It takes the timestamp in terms of milliseconds since January 1 1970, and returns the timezone offset in minutes. This provides a hook for drawing time based charts in specific time zones using their local DST crossover dates, with the help of external libraries. 
    * @example  <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/global/gettimezoneoffset/" target="_blank">Use moment.js to draw Oslo time regardless of browser locale</a>
    * @since 4.1.0
    */
  val getTimezoneOffset: js.UndefOr[js.Function] = js.undefined

  /**
    * The timezone offset in minutes. Positive values are west, negative values are east of UTC, as in the ECMAScript <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getTimezoneOffset">getTimezoneOffset</a> method. Use this to display UTC based data in a predefined time zone. 
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/global/timezoneoffset/" target="_blank">Timezone offset</a>
    * @since 3.0.8
    */
  val timezoneOffset: js.UndefOr[Double] = js.undefined

  /**
    * Whether to use UTC time for axis scaling, tickmark placement and time display in  <code>Highcharts.dateFormat</code>. Advantages of using UTC is that the time displays equally regardless of the user agent's time zone settings. Local time can be used when the data is loaded in real time or when correct Daylight Saving Time transitions are required.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/global/useutc-true/" target="_blank">True by default</a> - the starting point which is 
			at 00:00 UTC, is displayed as 00:00 in the axis labels and in the tooltip. 
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/global/useutc-false/" target="_blank">False</a> - the starting point which is 
			at 00:00 UTC, is displayed as your local browser time in the axis labels and in 
			the tooltip.
    */
  val useUTC: js.UndefOr[Boolean] = js.undefined
}
