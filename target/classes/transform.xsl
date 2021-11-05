<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="xml" indent="yes"/>
    <xsl:template match="root">
        <order>
            <orderId><xsl:value-of select="id"/>_<xsl:value-of select="batch"/></orderId>
            <documentDateTime><xsl:value-of  select="current-dateTime()"/></documentDateTime>
            <orderRows>
            <xsl:for-each select="rows/row">
                <orderRow>
                    <rowNumber><xsl:number/></rowNumber>
                   <description><xsl:value-of select="description"/></description> 
                </orderRow>
            </xsl:for-each>
            </orderRows>
        </order>
    </xsl:template>
</xsl:stylesheet>