/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>tooltip</code>
  */
@js.annotation.ScalaJSDefined
class Tooltip extends js.Object {

  /**
    * Enable or disable animation of the tooltip. In slow legacy IE browsers the animation is disabled by default.
    * @since 1.2.0
    */
  val animation: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The background color or gradient for the tooltip.</p>
    * 
    * <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the stroke width is set in the <code>.highcharts-tooltip-box</code> class.</p>
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/stock/tooltip/general/" target="_blank">Custom tooltip</a>.


<a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/tooltip-border-background/" target="_blank">Tooltip in styled mode</a>.
    */
  val backgroundColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The color of the tooltip border. When <code>null</code>, the border takes the color of the corresponding series or point.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/stock/tooltip/general/" target="_blank">Styled tooltip</a>
    */
  val borderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The radius of the rounded border corners.
    */
  val borderRadius: js.UndefOr[Double] = js.undefined

  /**
    * <p>The pixel width of the tooltip border.</p>
    * 
    * <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the stroke width is set in the <code>.highcharts-tooltip-box</code> class.</p>
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/stock/tooltip/general/" target="_blank">Custom tooltip</a>.	

<a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/tooltip-border-background/" target="_blank">Tooltip in styled mode</a>.
    */
  val borderWidth: js.UndefOr[Double] = js.undefined

  /**
    * How many decimals to show for the <code>point.change</code> value when the <code>series.compare</code> option is set. This is overridable in each series' tooltip options object. The default is to preserve all decimals.
    * @since 1.0.1
    */
  val changeDecimals: js.UndefOr[Double] = js.undefined

  /**
    * Since 2.1, the crosshair definitions are moved to the Axis object in order for a better separation from the tooltip. See <a href="#xAxis.crosshair">xAxis.crosshair<a>.
    */
  val crosshairs: js.Any = js.undefined

  /**
    * <p>For series on a datetime axes, the date format in the tooltip's header will by default be guessed based on the closest data points. This member gives the default string representations used for each unit. For an overview of the replacement codes, see <a href="#Highcharts.dateFormat">dateFormat</a>.</p>
    * 
    * <p>Defaults to:
    * <pre>{
    *     millisecond:"%A, %b %e, %H:%M:%S.%L",
    *     second:"%A, %b %e, %H:%M:%S",
    *     minute:"%A, %b %e, %H:%M",
    *     hour:"%A, %b %e, %H:%M",
    *     day:"%A, %b %e, %Y",
    *     week:"Week from %A, %b %e, %Y",
    *     month:"%B %Y",
    *     year:"%Y"
    * }</pre>
    * </p>
    */
  val dateTimeLabelFormats: js.UndefOr[js.Object] = js.undefined

  /**
    * Enable or disable the tooltip.
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Whether the tooltip should follow the mouse as it moves across columns, pie slices and other point types with an extent. By default it behaves this way for scatter, bubble and pie series by override in the <code>plotOptions</code> for those series types. </p>
    * <p>For touch moves to behave the same way, <a href="#tooltip.followTouchMove">followTouchMove</a> must be <code>true</code> also.</p>
    * @since 1.3
    */
  val followPointer: js.UndefOr[Boolean] = js.undefined

  /**
    * Whether the tooltip should follow the finger as it moves on a touch device. If this is <code>true</code> and <a href="#chart.panning">chart.panning</a> is set,<code>followTouchMove</code> will take over one-finger touches, so the user needs to use two fingers for zooming and panning.
    * @since 1.3.1
    */
  val followTouchMove: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Callback function to format the text of the tooltip from scratch. Return false to disable tooltip for a specific point on series.</p> <p>A subset of HTML is supported. The HTML of the tooltip is parsed and converted to SVG,  therefore this isn't a complete HTML renderer. The following tags are supported:  <code>&lt;b&gt;</code>, <code>&lt;strong&gt;</code>, <code>&lt;i&gt;</code>, <code>&lt;em&gt;</code>, <code>&lt;br/&gt;</code>, <code>&lt;span&gt;</code>. Spans can be styled with a <code>style</code> attribute, but only text-related CSS that is  shared with SVG is handled. </p> <p>Since version 2.1 the tooltip can be shared between multiple series through  the <code>shared</code> option. The available data in the formatter differ a bit depending on whether the tooltip is shared or not. In a shared tooltip, all  properties except <code>x</code>, which is common for all points, are kept in  an array, <code>this.points</code>. Another feature that affects what properties are available, is <a href="#plotOptions.series.dataGrouping">dataGrouping</a>.</p>  <p>Available data are:</p> <dl> 	<dt>this.percentage (not shared) / this.points[i].percentage (shared)</dt> 	<dd>Stacked series and pies only. The point's percentage of the total.</dd> 	 	<dt>this.point (not shared) / this.points[i].point (shared)</dt> 	<dd>The point object. The point name, if defined, is available  through <code>this.point.name</code>.</dd> 	 	<dt>this.points</dt> 	<dd>In a shared tooltip, this is an array containing all other properties for each point.</dd> 	 	<dt>this.series (not shared) / this.points[i].series (shared)</dt> 	<dd>The series object. The series name is available  through <code>this.series.name</code>.</dd>  	<dt>this.total (not shared) / this.points[i].total (shared)</dt> 	<dd>Stacked series only. The total value at this point's x value.</dd> 	 	<dt>this.x</dt> 	<dd>The x value. This property is the same regardless of the tooltip being shared or not.</dd> 	 	<dt>this.y (not shared) / this.points[i].y (shared)</dt> 	<dd>The y value.</dd>  </dl>
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/stock/tooltip/formatter/" target="_blank">formatting with shared tooltip</a>
    */
  val formatter: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>The HTML of the tooltip header line. Variables are enclosed by curly brackets. Available variables			are <code>point.key</code>, <code>series.name</code>, <code>series.color</code> and other members from the <code>point</code> and <code>series</code> objects. The <code>point.key</code> variable contains the category name, x value or datetime string depending on the type of axis. For datetime axes, the <code>point.key</code> date format can be set using tooltip.xDateFormat.</p>
    *  
    * <p>Defaults to <code>&lt;span style="font-size: 10px"&gt;{point.key}&lt;/span&gt;&lt;br/&gt;</code></p>
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/footerformat/" target="_blank">A HTML table in the tooltip</a>
    */
  val headerFormat: js.UndefOr[String] = js.undefined

  /**
    * Padding inside the tooltip, in pixels.
    * @since 5.0.0
    */
  val padding: js.UndefOr[Double] = js.undefined

  /**
    * <p>The HTML of the point's line in the tooltip. Variables are enclosed by curly brackets. Available variables are point.x, point.y, point.change, series.name and series.color and other properties on the same form. Furthermore,  point.y can be extended by the tooltip.valuePrefix and tooltip.valueSuffix variables. This can also be overridden for each series, which makes it a good hook for displaying units.</p>
    * <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the dot is colored by a class name rather than the point color.</p>
    */
  val pointFormat: js.UndefOr[String] = js.undefined

  /**
    * A callback function for formatting the HTML output for a single point in the tooltip. Like the <code>pointFormat</code> string, but with more flexibility.
    * @since 2.1.0
    */
  val pointFormatter: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>A callback function to place the tooltip in a default position. The callback receives three parameters: <code>labelWidth</code>, <code>labelHeight</code> and <code>point</code>, where point contains values for <code>plotX</code> and <code>plotY</code> telling where the reference point is in the plot area. Add <code>chart.plotLeft</code> and <code>chart.plotTop</code> to get the full coordinates.</p>
    * 
    * <p>The return should be an object containing x and y values, for example <code>{ x: 100, y: 100 }</code>.</p>
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/stock/tooltip/positioner/" target="_blank">
				A fixed tooltip position on top of the chart</a>
    * @since 1.1.5
    */
  val positioner: js.UndefOr[js.Function] = js.undefined

  /**
    * Whether to apply a drop shadow to the tooltip.
    */
  val shadow: js.UndefOr[Boolean] = js.undefined

  /**
    * The name of a symbol to use for the border around the tooltip. In Highstock 1.x, the shape was <code>square</code>. 
    * @since 2.0
    */
  val shape: js.UndefOr[String] = js.undefined

  /**
    * <p>When the tooltip is shared, the entire plot area will capture mouse movement or touch events. Tooltip texts for series types with ordered data (not pie, scatter, flags etc) will be shown in a single bubble. This is recommended for single series charts and for tablet/mobile optimized charts.</p>
    * 
    * <p>See also <a href="#tooltip.split">tooltip.split</a>, that is better suited for charts with many series, especially line-type series.</p>
    */
  val shared: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Proximity snap for graphs or single points. It defaults to 10 for mouse-powered devices and 25 for touch devices.</p>
    * 
    * <p>Note that in most cases the whole plot area captures the mouse movement, and in these cases <code>tooltip.snap</code> doesn't make sense. This applies when <a href="#plotOptions.series.stickyTracking">stickyTracking</a> is <code>true</code> (default) and when the tooltip is <a href="#tooltip.shared">shared</a> or <a href="#tooltip.split">split</a>.</p>
    */
  val snap: js.UndefOr[Double] = js.undefined

  /**
    * Split the tooltip into one label per series, with the header close to the axis. This is recommended over <a href="#tooltip.shared">shared</a> tooltips for charts with multiple line series, generally making them easier to read.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/split/" target="_blank">Split tooltip</a>
    * @since 5.0.0
    */
  val split: js.UndefOr[Boolean] = js.undefined

  /**
    * CSS styles for the tooltip. The tooltip can also be styled through the CSS
    *  class <code>.highcharts-tooltip</code>.
    */
  val style: js.UndefOr[js.Object] = js.undefined

  /**
    * Use HTML to render the contents of the tooltip instead of SVG. Using HTML allows advanced formatting like tables and images in the tooltip. It is also recommended for rtl languages as it works around rtl bugs in early Firefox.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/footerformat/" target="_blank">A table for value alignment</a>.  <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/fullhtml/" target="_blank">Full HTML tooltip</a>.
    * @since 2.2
    */
  val useHTML: js.UndefOr[Boolean] = js.undefined

  /**
    * How many decimals to show in each series' y value. This is overridable in each series' tooltip options object.
    *  The default is to preserve all decimals.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/valuedecimals/" target="_blank">Set decimals, prefix and suffix for the value</a>
    * @since 1.2
    */
  val valueDecimals: js.UndefOr[Double] = js.undefined

  /**
    * A string to prepend to each series' y value. Overridable in each series' tooltip options object.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/valuedecimals/" target="_blank">Set decimals, prefix and suffix for the value</a>
    * @since 1.2
    */
  val valuePrefix: js.UndefOr[String] = js.undefined

  /**
    * A string to append to each series' y value. Overridable in each series' tooltip options object.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/valuedecimals/" target="_blank">Set decimals, prefix and suffix for the value</a>
    * @since 1.2
    */
  val valueSuffix: js.UndefOr[String] = js.undefined

  /**
    * The format for the date in the tooltip header. If data grouping is used, the default is  a smart guess based on how close the closest points are. It is pulled from the #plotOptions.dataGrouping.dateTimeLabelFormats array.
    */
  val xDateFormat: js.UndefOr[String] = js.undefined
}

object Tooltip {
  /**
    * @param animation Enable or disable animation of the tooltip. In slow legacy IE browsers the animation is disabled by default.
    * @param backgroundColor <p>The background color or gradient for the tooltip.</p>. . <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the stroke width is set in the <code>.highcharts-tooltip-box</code> class.</p>
    * @param borderColor The color of the tooltip border. When <code>null</code>, the border takes the color of the corresponding series or point.
    * @param borderRadius The radius of the rounded border corners.
    * @param borderWidth <p>The pixel width of the tooltip border.</p>. . <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the stroke width is set in the <code>.highcharts-tooltip-box</code> class.</p>
    * @param changeDecimals How many decimals to show for the <code>point.change</code> value when the <code>series.compare</code> option is set. This is overridable in each series' tooltip options object. The default is to preserve all decimals.
    * @param crosshairs Since 2.1, the crosshair definitions are moved to the Axis object in order for a better separation from the tooltip. See <a href="#xAxis.crosshair">xAxis.crosshair<a>.
    * @param dateTimeLabelFormats <p>For series on a datetime axes, the date format in the tooltip's header will by default be guessed based on the closest data points. This member gives the default string representations used for each unit. For an overview of the replacement codes, see <a href="#Highcharts.dateFormat">dateFormat</a>.</p>. . <p>Defaults to:. <pre>{.     millisecond:"%A, %b %e, %H:%M:%S.%L",.     second:"%A, %b %e, %H:%M:%S",.     minute:"%A, %b %e, %H:%M",.     hour:"%A, %b %e, %H:%M",.     day:"%A, %b %e, %Y",.     week:"Week from %A, %b %e, %Y",.     month:"%B %Y",.     year:"%Y". }</pre>. </p>
    * @param enabled Enable or disable the tooltip.
    * @param followPointer <p>Whether the tooltip should follow the mouse as it moves across columns, pie slices and other point types with an extent. By default it behaves this way for scatter, bubble and pie series by override in the <code>plotOptions</code> for those series types. </p>. <p>For touch moves to behave the same way, <a href="#tooltip.followTouchMove">followTouchMove</a> must be <code>true</code> also.</p>
    * @param followTouchMove Whether the tooltip should follow the finger as it moves on a touch device. If this is <code>true</code> and <a href="#chart.panning">chart.panning</a> is set,<code>followTouchMove</code> will take over one-finger touches, so the user needs to use two fingers for zooming and panning.
    * @param formatter <p>Callback function to format the text of the tooltip from scratch. Return false to disable tooltip for a specific point on series.</p> <p>A subset of HTML is supported. The HTML of the tooltip is parsed and converted to SVG,  therefore this isn't a complete HTML renderer. The following tags are supported:  <code>&lt;b&gt;</code>, <code>&lt;strong&gt;</code>, <code>&lt;i&gt;</code>, <code>&lt;em&gt;</code>, <code>&lt;br/&gt;</code>, <code>&lt;span&gt;</code>. Spans can be styled with a <code>style</code> attribute, but only text-related CSS that is  shared with SVG is handled. </p> <p>Since version 2.1 the tooltip can be shared between multiple series through  the <code>shared</code> option. The available data in the formatter differ a bit depending on whether the tooltip is shared or not. In a shared tooltip, all  properties except <code>x</code>, which is common for all points, are kept in  an array, <code>this.points</code>. Another feature that affects what properties are available, is <a href="#plotOptions.series.dataGrouping">dataGrouping</a>.</p>  <p>Available data are:</p> <dl> 	<dt>this.percentage (not shared) / this.points[i].percentage (shared)</dt> 	<dd>Stacked series and pies only. The point's percentage of the total.</dd> 	 	<dt>this.point (not shared) / this.points[i].point (shared)</dt> 	<dd>The point object. The point name, if defined, is available  through <code>this.point.name</code>.</dd> 	 	<dt>this.points</dt> 	<dd>In a shared tooltip, this is an array containing all other properties for each point.</dd> 	 	<dt>this.series (not shared) / this.points[i].series (shared)</dt> 	<dd>The series object. The series name is available  through <code>this.series.name</code>.</dd>  	<dt>this.total (not shared) / this.points[i].total (shared)</dt> 	<dd>Stacked series only. The total value at this point's x value.</dd> 	 	<dt>this.x</dt> 	<dd>The x value. This property is the same regardless of the tooltip being shared or not.</dd> 	 	<dt>this.y (not shared) / this.points[i].y (shared)</dt> 	<dd>The y value.</dd>  </dl>
    * @param headerFormat <p>The HTML of the tooltip header line. Variables are enclosed by curly brackets. Available variables			are <code>point.key</code>, <code>series.name</code>, <code>series.color</code> and other members from the <code>point</code> and <code>series</code> objects. The <code>point.key</code> variable contains the category name, x value or datetime string depending on the type of axis. For datetime axes, the <code>point.key</code> date format can be set using tooltip.xDateFormat.</p>.  . <p>Defaults to <code>&lt;span style="font-size: 10px"&gt;{point.key}&lt;/span&gt;&lt;br/&gt;</code></p>
    * @param padding Padding inside the tooltip, in pixels.
    * @param pointFormat <p>The HTML of the point's line in the tooltip. Variables are enclosed by curly brackets. Available variables are point.x, point.y, point.change, series.name and series.color and other properties on the same form. Furthermore,  point.y can be extended by the tooltip.valuePrefix and tooltip.valueSuffix variables. This can also be overridden for each series, which makes it a good hook for displaying units.</p>. <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the dot is colored by a class name rather than the point color.</p>
    * @param pointFormatter A callback function for formatting the HTML output for a single point in the tooltip. Like the <code>pointFormat</code> string, but with more flexibility.
    * @param positioner <p>A callback function to place the tooltip in a default position. The callback receives three parameters: <code>labelWidth</code>, <code>labelHeight</code> and <code>point</code>, where point contains values for <code>plotX</code> and <code>plotY</code> telling where the reference point is in the plot area. Add <code>chart.plotLeft</code> and <code>chart.plotTop</code> to get the full coordinates.</p>. . <p>The return should be an object containing x and y values, for example <code>{ x: 100, y: 100 }</code>.</p>
    * @param shadow Whether to apply a drop shadow to the tooltip.
    * @param shape The name of a symbol to use for the border around the tooltip. In Highstock 1.x, the shape was <code>square</code>. 
    * @param shared <p>When the tooltip is shared, the entire plot area will capture mouse movement or touch events. Tooltip texts for series types with ordered data (not pie, scatter, flags etc) will be shown in a single bubble. This is recommended for single series charts and for tablet/mobile optimized charts.</p>. . <p>See also <a href="#tooltip.split">tooltip.split</a>, that is better suited for charts with many series, especially line-type series.</p>
    * @param snap <p>Proximity snap for graphs or single points. It defaults to 10 for mouse-powered devices and 25 for touch devices.</p>. . <p>Note that in most cases the whole plot area captures the mouse movement, and in these cases <code>tooltip.snap</code> doesn't make sense. This applies when <a href="#plotOptions.series.stickyTracking">stickyTracking</a> is <code>true</code> (default) and when the tooltip is <a href="#tooltip.shared">shared</a> or <a href="#tooltip.split">split</a>.</p>
    * @param split Split the tooltip into one label per series, with the header close to the axis. This is recommended over <a href="#tooltip.shared">shared</a> tooltips for charts with multiple line series, generally making them easier to read.
    * @param style CSS styles for the tooltip. The tooltip can also be styled through the CSS.  class <code>.highcharts-tooltip</code>.
    * @param useHTML Use HTML to render the contents of the tooltip instead of SVG. Using HTML allows advanced formatting like tables and images in the tooltip. It is also recommended for rtl languages as it works around rtl bugs in early Firefox.
    * @param valueDecimals How many decimals to show in each series' y value. This is overridable in each series' tooltip options object..  The default is to preserve all decimals.
    * @param valuePrefix A string to prepend to each series' y value. Overridable in each series' tooltip options object.
    * @param valueSuffix A string to append to each series' y value. Overridable in each series' tooltip options object.
    * @param xDateFormat The format for the date in the tooltip header. If data grouping is used, the default is  a smart guess based on how close the closest points are. It is pulled from the #plotOptions.dataGrouping.dateTimeLabelFormats array.
    */
  def apply(animation: js.UndefOr[Boolean] = js.undefined, backgroundColor: js.UndefOr[String | js.Object] = js.undefined, borderColor: js.UndefOr[String | js.Object] = js.undefined, borderRadius: js.UndefOr[Double] = js.undefined, borderWidth: js.UndefOr[Double] = js.undefined, changeDecimals: js.UndefOr[Double] = js.undefined, crosshairs: js.UndefOr[js.Any] = js.undefined, dateTimeLabelFormats: js.UndefOr[js.Object] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, followPointer: js.UndefOr[Boolean] = js.undefined, followTouchMove: js.UndefOr[Boolean] = js.undefined, formatter: js.UndefOr[js.Function] = js.undefined, headerFormat: js.UndefOr[String] = js.undefined, padding: js.UndefOr[Double] = js.undefined, pointFormat: js.UndefOr[String] = js.undefined, pointFormatter: js.UndefOr[js.Function] = js.undefined, positioner: js.UndefOr[js.Function] = js.undefined, shadow: js.UndefOr[Boolean] = js.undefined, shape: js.UndefOr[String] = js.undefined, shared: js.UndefOr[Boolean] = js.undefined, snap: js.UndefOr[Double] = js.undefined, split: js.UndefOr[Boolean] = js.undefined, style: js.UndefOr[js.Object] = js.undefined, useHTML: js.UndefOr[Boolean] = js.undefined, valueDecimals: js.UndefOr[Double] = js.undefined, valuePrefix: js.UndefOr[String] = js.undefined, valueSuffix: js.UndefOr[String] = js.undefined, xDateFormat: js.UndefOr[String] = js.undefined): Tooltip = {
    val animationOuter: js.UndefOr[Boolean] = animation
    val backgroundColorOuter: js.UndefOr[String | js.Object] = backgroundColor
    val borderColorOuter: js.UndefOr[String | js.Object] = borderColor
    val borderRadiusOuter: js.UndefOr[Double] = borderRadius
    val borderWidthOuter: js.UndefOr[Double] = borderWidth
    val changeDecimalsOuter: js.UndefOr[Double] = changeDecimals
    val crosshairsOuter: js.Any = crosshairs
    val dateTimeLabelFormatsOuter: js.UndefOr[js.Object] = dateTimeLabelFormats
    val enabledOuter: js.UndefOr[Boolean] = enabled
    val followPointerOuter: js.UndefOr[Boolean] = followPointer
    val followTouchMoveOuter: js.UndefOr[Boolean] = followTouchMove
    val formatterOuter: js.UndefOr[js.Function] = formatter
    val headerFormatOuter: js.UndefOr[String] = headerFormat
    val paddingOuter: js.UndefOr[Double] = padding
    val pointFormatOuter: js.UndefOr[String] = pointFormat
    val pointFormatterOuter: js.UndefOr[js.Function] = pointFormatter
    val positionerOuter: js.UndefOr[js.Function] = positioner
    val shadowOuter: js.UndefOr[Boolean] = shadow
    val shapeOuter: js.UndefOr[String] = shape
    val sharedOuter: js.UndefOr[Boolean] = shared
    val snapOuter: js.UndefOr[Double] = snap
    val splitOuter: js.UndefOr[Boolean] = split
    val styleOuter: js.UndefOr[js.Object] = style
    val useHTMLOuter: js.UndefOr[Boolean] = useHTML
    val valueDecimalsOuter: js.UndefOr[Double] = valueDecimals
    val valuePrefixOuter: js.UndefOr[String] = valuePrefix
    val valueSuffixOuter: js.UndefOr[String] = valueSuffix
    val xDateFormatOuter: js.UndefOr[String] = xDateFormat
    new Tooltip {
      override val animation: js.UndefOr[Boolean] = animationOuter
      override val backgroundColor: js.UndefOr[String | js.Object] = backgroundColorOuter
      override val borderColor: js.UndefOr[String | js.Object] = borderColorOuter
      override val borderRadius: js.UndefOr[Double] = borderRadiusOuter
      override val borderWidth: js.UndefOr[Double] = borderWidthOuter
      override val changeDecimals: js.UndefOr[Double] = changeDecimalsOuter
      override val crosshairs: js.Any = crosshairsOuter
      override val dateTimeLabelFormats: js.UndefOr[js.Object] = dateTimeLabelFormatsOuter
      override val enabled: js.UndefOr[Boolean] = enabledOuter
      override val followPointer: js.UndefOr[Boolean] = followPointerOuter
      override val followTouchMove: js.UndefOr[Boolean] = followTouchMoveOuter
      override val formatter: js.UndefOr[js.Function] = formatterOuter
      override val headerFormat: js.UndefOr[String] = headerFormatOuter
      override val padding: js.UndefOr[Double] = paddingOuter
      override val pointFormat: js.UndefOr[String] = pointFormatOuter
      override val pointFormatter: js.UndefOr[js.Function] = pointFormatterOuter
      override val positioner: js.UndefOr[js.Function] = positionerOuter
      override val shadow: js.UndefOr[Boolean] = shadowOuter
      override val shape: js.UndefOr[String] = shapeOuter
      override val shared: js.UndefOr[Boolean] = sharedOuter
      override val snap: js.UndefOr[Double] = snapOuter
      override val split: js.UndefOr[Boolean] = splitOuter
      override val style: js.UndefOr[js.Object] = styleOuter
      override val useHTML: js.UndefOr[Boolean] = useHTMLOuter
      override val valueDecimals: js.UndefOr[Double] = valueDecimalsOuter
      override val valuePrefix: js.UndefOr[String] = valuePrefixOuter
      override val valueSuffix: js.UndefOr[String] = valueSuffixOuter
      override val xDateFormat: js.UndefOr[String] = xDateFormatOuter
    }
  }
}
