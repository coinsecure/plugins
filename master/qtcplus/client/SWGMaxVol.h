/*
 * SWGMaxVol.h
 * 
 * 
 */

#ifndef SWGMaxVol_H_
#define SWGMaxVol_H_

#include <QJsonObject>



#include "SWGObject.h"


namespace Swagger {

class SWGMaxVol: public SWGObject {
public:
    SWGMaxVol();
    SWGMaxVol(QString* json);
    virtual ~SWGMaxVol();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGMaxVol* fromJson(QString &jsonString);

    qint64 getMaxVol();
    void setMaxVol(qint64 maxVol);

private:
    qint64 maxVol;
};

} /* namespace Swagger */

#endif /* SWGMaxVol_H_ */
