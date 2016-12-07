<?xml version = '1.0' encoding = 'ISO-8859-1' ?>
<asm version="1.0" name="0">
	<cp>
		<constant value="Small2UML"/>
		<constant value="links"/>
		<constant value="NTransientLinkSet;"/>
		<constant value="col"/>
		<constant value="J"/>
		<constant value="main"/>
		<constant value="A"/>
		<constant value="OclParametrizedType"/>
		<constant value="#native"/>
		<constant value="Collection"/>
		<constant value="J.setName(S):V"/>
		<constant value="OclSimpleType"/>
		<constant value="OclAny"/>
		<constant value="J.setElementType(J):V"/>
		<constant value="TransientLinkSet"/>
		<constant value="A.__matcher__():V"/>
		<constant value="A.__exec__():V"/>
		<constant value="self"/>
		<constant value="__resolve__"/>
		<constant value="1"/>
		<constant value="J.oclIsKindOf(J):B"/>
		<constant value="18"/>
		<constant value="NTransientLinkSet;.getLinkBySourceElement(S):QNTransientLink;"/>
		<constant value="J.oclIsUndefined():B"/>
		<constant value="15"/>
		<constant value="NTransientLink;.getTargetFromSource(J):J"/>
		<constant value="17"/>
		<constant value="30"/>
		<constant value="Sequence"/>
		<constant value="2"/>
		<constant value="A.__resolve__(J):J"/>
		<constant value="QJ.including(J):QJ"/>
		<constant value="QJ.flatten():QJ"/>
		<constant value="e"/>
		<constant value="value"/>
		<constant value="resolveTemp"/>
		<constant value="S"/>
		<constant value="NTransientLink;.getNamedTargetFromSource(JS):J"/>
		<constant value="name"/>
		<constant value="__matcher__"/>
		<constant value="A.__matchSmallType2Type():V"/>
		<constant value="A.__matchSmallClass2Class():V"/>
		<constant value="A.__matchSmallAttribute2Attribute():V"/>
		<constant value="A.__matchSmallOperation2Operation():V"/>
		<constant value="__exec__"/>
		<constant value="SmallType2Type"/>
		<constant value="NTransientLinkSet;.getLinksByRule(S):QNTransientLink;"/>
		<constant value="A.__applySmallType2Type(NTransientLink;):V"/>
		<constant value="SmallClass2Class"/>
		<constant value="A.__applySmallClass2Class(NTransientLink;):V"/>
		<constant value="SmallAttribute2Attribute"/>
		<constant value="A.__applySmallAttribute2Attribute(NTransientLink;):V"/>
		<constant value="SmallOperation2Operation"/>
		<constant value="A.__applySmallOperation2Operation(NTransientLink;):V"/>
		<constant value="__matchSmallType2Type"/>
		<constant value="TransientLink"/>
		<constant value="NTransientLink;.setRule(MATL!Rule;):V"/>
		<constant value="f"/>
		<constant value="NTransientLink;.addSourceElement(SJ):V"/>
		<constant value="t"/>
		<constant value="Type"/>
		<constant value="MM1"/>
		<constant value="NTransientLink;.addTargetElement(SJ):V"/>
		<constant value="NTransientLinkSet;.addLink2(NTransientLink;B):V"/>
		<constant value="11:3-13:4"/>
		<constant value="__applySmallType2Type"/>
		<constant value="NTransientLink;"/>
		<constant value="NTransientLink;.getSourceElement(S):J"/>
		<constant value="NTransientLink;.getTargetElement(S):J"/>
		<constant value="3"/>
		<constant value="12:12-12:13"/>
		<constant value="12:12-12:18"/>
		<constant value="12:4-12:18"/>
		<constant value="link"/>
		<constant value="__matchSmallClass2Class"/>
		<constant value="Class"/>
		<constant value="20:3-25:4"/>
		<constant value="__applySmallClass2Class"/>
		<constant value="operations"/>
		<constant value="ownedOperation"/>
		<constant value="extends"/>
		<constant value="superClass"/>
		<constant value="attributes"/>
		<constant value="attribute"/>
		<constant value="abstract"/>
		<constant value="isAbstract"/>
		<constant value="21:22-21:23"/>
		<constant value="21:22-21:34"/>
		<constant value="21:4-21:34"/>
		<constant value="22:18-22:19"/>
		<constant value="22:18-22:27"/>
		<constant value="22:4-22:27"/>
		<constant value="23:17-23:18"/>
		<constant value="23:17-23:29"/>
		<constant value="23:4-23:29"/>
		<constant value="24:18-24:19"/>
		<constant value="24:18-24:28"/>
		<constant value="24:4-24:28"/>
		<constant value="__matchSmallAttribute2Attribute"/>
		<constant value="Property"/>
		<constant value="32:3-35:4"/>
		<constant value="__applySmallAttribute2Attribute"/>
		<constant value="type"/>
		<constant value="33:12-33:13"/>
		<constant value="33:12-33:18"/>
		<constant value="33:4-33:18"/>
		<constant value="34:12-34:13"/>
		<constant value="34:12-34:18"/>
		<constant value="34:4-34:18"/>
		<constant value="__matchSmallOperation2Operation"/>
		<constant value="Operation"/>
		<constant value="42:3-46:4"/>
		<constant value="__applySmallOperation2Operation"/>
		<constant value="returnType"/>
		<constant value="parameters"/>
		<constant value="ownedParameter"/>
		<constant value="43:12-43:13"/>
		<constant value="43:12-43:18"/>
		<constant value="43:4-43:18"/>
		<constant value="44:12-44:13"/>
		<constant value="44:12-44:24"/>
		<constant value="44:4-44:24"/>
		<constant value="45:22-45:23"/>
		<constant value="45:22-45:34"/>
		<constant value="45:4-45:34"/>
	</cp>
	<field name="1" type="2"/>
	<field name="3" type="4"/>
	<operation name="5">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<push arg="7"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="9"/>
			<pcall arg="10"/>
			<dup/>
			<push arg="11"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="12"/>
			<pcall arg="10"/>
			<pcall arg="13"/>
			<set arg="3"/>
			<getasm/>
			<push arg="14"/>
			<push arg="8"/>
			<new/>
			<set arg="1"/>
			<getasm/>
			<pcall arg="15"/>
			<getasm/>
			<pcall arg="16"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="24"/>
		</localvariabletable>
	</operation>
	<operation name="18">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
		</parameters>
		<code>
			<load arg="19"/>
			<getasm/>
			<get arg="3"/>
			<call arg="20"/>
			<if arg="21"/>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<dup/>
			<call arg="23"/>
			<if arg="24"/>
			<load arg="19"/>
			<call arg="25"/>
			<goto arg="26"/>
			<pop/>
			<load arg="19"/>
			<goto arg="27"/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<load arg="19"/>
			<iterate/>
			<store arg="29"/>
			<getasm/>
			<load arg="29"/>
			<call arg="30"/>
			<call arg="31"/>
			<enditerate/>
			<call arg="32"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="33" begin="23" end="27"/>
			<lve slot="0" name="17" begin="0" end="29"/>
			<lve slot="1" name="34" begin="0" end="29"/>
		</localvariabletable>
	</operation>
	<operation name="35">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
			<parameter name="29" type="36"/>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<load arg="19"/>
			<load arg="29"/>
			<call arg="37"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="6"/>
			<lve slot="1" name="34" begin="0" end="6"/>
			<lve slot="2" name="38" begin="0" end="6"/>
		</localvariabletable>
	</operation>
	<operation name="39">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<pcall arg="40"/>
			<getasm/>
			<pcall arg="41"/>
			<getasm/>
			<pcall arg="42"/>
			<getasm/>
			<pcall arg="43"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="7"/>
		</localvariabletable>
	</operation>
	<operation name="44">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="45"/>
			<call arg="46"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="47"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="48"/>
			<call arg="46"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="49"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="50"/>
			<call arg="46"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="51"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="52"/>
			<call arg="46"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="53"/>
			<enditerate/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="33" begin="5" end="8"/>
			<lve slot="1" name="33" begin="15" end="18"/>
			<lve slot="1" name="33" begin="25" end="28"/>
			<lve slot="1" name="33" begin="35" end="38"/>
			<lve slot="0" name="17" begin="0" end="39"/>
		</localvariabletable>
	</operation>
	<operation name="54">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="55"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="45"/>
			<pcall arg="56"/>
			<dup/>
			<push arg="57"/>
			<load arg="19"/>
			<pcall arg="58"/>
			<dup/>
			<push arg="59"/>
			<push arg="60"/>
			<push arg="61"/>
			<new/>
			<pcall arg="62"/>
			<pusht/>
			<pcall arg="63"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="64" begin="14" end="19"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="57" begin="1" end="21"/>
			<lve slot="0" name="17" begin="0" end="22"/>
		</localvariabletable>
	</operation>
	<operation name="65">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="66"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="57"/>
			<call arg="67"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="59"/>
			<call arg="68"/>
			<store arg="69"/>
			<load arg="69"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="38"/>
			<call arg="30"/>
			<set arg="38"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="70" begin="11" end="11"/>
			<lne id="71" begin="11" end="12"/>
			<lne id="72" begin="9" end="14"/>
			<lne id="64" begin="8" end="15"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="59" begin="7" end="15"/>
			<lve slot="2" name="57" begin="3" end="15"/>
			<lve slot="0" name="17" begin="0" end="15"/>
			<lve slot="1" name="73" begin="0" end="15"/>
		</localvariabletable>
	</operation>
	<operation name="74">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="55"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="48"/>
			<pcall arg="56"/>
			<dup/>
			<push arg="57"/>
			<load arg="19"/>
			<pcall arg="58"/>
			<dup/>
			<push arg="59"/>
			<push arg="75"/>
			<push arg="61"/>
			<new/>
			<pcall arg="62"/>
			<pusht/>
			<pcall arg="63"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="76" begin="14" end="19"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="57" begin="1" end="21"/>
			<lve slot="0" name="17" begin="0" end="22"/>
		</localvariabletable>
	</operation>
	<operation name="77">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="66"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="57"/>
			<call arg="67"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="59"/>
			<call arg="68"/>
			<store arg="69"/>
			<load arg="69"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="78"/>
			<call arg="30"/>
			<set arg="79"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="80"/>
			<call arg="30"/>
			<set arg="81"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="82"/>
			<call arg="30"/>
			<set arg="83"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="84"/>
			<call arg="30"/>
			<set arg="85"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="86" begin="11" end="11"/>
			<lne id="87" begin="11" end="12"/>
			<lne id="88" begin="9" end="14"/>
			<lne id="89" begin="17" end="17"/>
			<lne id="90" begin="17" end="18"/>
			<lne id="91" begin="15" end="20"/>
			<lne id="92" begin="23" end="23"/>
			<lne id="93" begin="23" end="24"/>
			<lne id="94" begin="21" end="26"/>
			<lne id="95" begin="29" end="29"/>
			<lne id="96" begin="29" end="30"/>
			<lne id="97" begin="27" end="32"/>
			<lne id="76" begin="8" end="33"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="59" begin="7" end="33"/>
			<lve slot="2" name="57" begin="3" end="33"/>
			<lve slot="0" name="17" begin="0" end="33"/>
			<lve slot="1" name="73" begin="0" end="33"/>
		</localvariabletable>
	</operation>
	<operation name="98">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="55"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="50"/>
			<pcall arg="56"/>
			<dup/>
			<push arg="57"/>
			<load arg="19"/>
			<pcall arg="58"/>
			<dup/>
			<push arg="59"/>
			<push arg="99"/>
			<push arg="61"/>
			<new/>
			<pcall arg="62"/>
			<pusht/>
			<pcall arg="63"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="100" begin="14" end="19"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="57" begin="1" end="21"/>
			<lve slot="0" name="17" begin="0" end="22"/>
		</localvariabletable>
	</operation>
	<operation name="101">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="66"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="57"/>
			<call arg="67"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="59"/>
			<call arg="68"/>
			<store arg="69"/>
			<load arg="69"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="38"/>
			<call arg="30"/>
			<set arg="38"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="102"/>
			<call arg="30"/>
			<set arg="102"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="103" begin="11" end="11"/>
			<lne id="104" begin="11" end="12"/>
			<lne id="105" begin="9" end="14"/>
			<lne id="106" begin="17" end="17"/>
			<lne id="107" begin="17" end="18"/>
			<lne id="108" begin="15" end="20"/>
			<lne id="100" begin="8" end="21"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="59" begin="7" end="21"/>
			<lve slot="2" name="57" begin="3" end="21"/>
			<lve slot="0" name="17" begin="0" end="21"/>
			<lve slot="1" name="73" begin="0" end="21"/>
		</localvariabletable>
	</operation>
	<operation name="109">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="55"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="52"/>
			<pcall arg="56"/>
			<dup/>
			<push arg="57"/>
			<load arg="19"/>
			<pcall arg="58"/>
			<dup/>
			<push arg="59"/>
			<push arg="110"/>
			<push arg="61"/>
			<new/>
			<pcall arg="62"/>
			<pusht/>
			<pcall arg="63"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="111" begin="14" end="19"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="57" begin="1" end="21"/>
			<lve slot="0" name="17" begin="0" end="22"/>
		</localvariabletable>
	</operation>
	<operation name="112">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="66"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="57"/>
			<call arg="67"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="59"/>
			<call arg="68"/>
			<store arg="69"/>
			<load arg="69"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="38"/>
			<call arg="30"/>
			<set arg="38"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="113"/>
			<call arg="30"/>
			<set arg="102"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="114"/>
			<call arg="30"/>
			<set arg="115"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="116" begin="11" end="11"/>
			<lne id="117" begin="11" end="12"/>
			<lne id="118" begin="9" end="14"/>
			<lne id="119" begin="17" end="17"/>
			<lne id="120" begin="17" end="18"/>
			<lne id="121" begin="15" end="20"/>
			<lne id="122" begin="23" end="23"/>
			<lne id="123" begin="23" end="24"/>
			<lne id="124" begin="21" end="26"/>
			<lne id="111" begin="8" end="27"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="59" begin="7" end="27"/>
			<lve slot="2" name="57" begin="3" end="27"/>
			<lve slot="0" name="17" begin="0" end="27"/>
			<lve slot="1" name="73" begin="0" end="27"/>
		</localvariabletable>
	</operation>
</asm>
